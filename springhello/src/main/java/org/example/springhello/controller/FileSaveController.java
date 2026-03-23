package org.example.springhello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.UUID;

@Controller
public class FileSaveController {
    @PostMapping("/upload/save")
    @ResponseBody
    public String save(@RequestParam("file")MultipartFile file) throws IOException {
        if (file == null || file.isEmpty()) {
            return "파일이 비어 있습니다.";
        }
        String original = file.getOriginalFilename();
        if (original == null) {
            original = "unknown";
        }
           original = original.replace("\\", "_").replace("/", "_");

        // 4️⃣ 저장 파일명 생성
        // - UUID를 앞에 붙여 파일명 충돌 방지
        // - 동일한 파일명이 업로드되어도 덮어쓰기 방지
        String savedName = UUID.randomUUID() + "_" + original;

        // 5️⃣ 업로드 디렉터리 경로 설정 (절대 경로)
        // - System.getProperty("user.dir") : 애플리케이션 실행 기준 디렉터리
        // - 상대 경로 사용 시 Tomcat work 디렉터리로 꼬이는 문제를 방지하기 위함
        Path uploadPath = Path
                .of(System.getProperty("user.dir"), "uploads")
                .toAbsolutePath();

        // 6️⃣ uploads 디렉터리가 없으면 생성
        // - 이미 존재하면 아무 작업도 하지 않음
        Files.createDirectories(uploadPath);

        // 7️⃣ 최종 저장 경로 생성
        // uploads/<UUID>_원본파일명
        Path dest = uploadPath.resolve(savedName);

        // 8️⃣ 실제 파일 저장
        // - MultipartFile → 로컬 파일로 변환
        // - 내부적으로 스트림 복사 수행
        file.transferTo(dest.toFile());

        // 9️⃣ 저장 결과 반환
        return "저장 완료: " + dest;
    }
}
