Write-Host "backend build start"
& "./gradlew.bat" build

# 3. 가장 최근 .jar 파일 경로 추출
$jarPath = Get-ChildItem -Path "build/libs" -Filter "*.jar" | Sort-Object LastWriteTime -Descending | Select-Object -First 1

# 4. 서버에 복사
Write-Host "uploading $($jarPath.Name) to 195"
scp $jarPath.FullName root@192.168.0.195:/root/

# 5. 서버에서 systemd 재시작 (선택 사항 – SSH로 원격 명령)
ssh root@192.168.0.195 "systemctl restart kt-backend.service"

Write-Host "backend deploy finish"