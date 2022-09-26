package MiniProject1.controller;


import java.io.FileNotFoundException;
import java.io.IOException;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import MiniProject1.service.BatchService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/batchController")
public class ExecuteBatchController {

    private final BatchService batchService;

    private final static String FILE_PATH = "./data1.csv";


    @GetMapping("/healthCheck")
    public String healthCheck() {
        return "checking health message appeared";
    }

    @GetMapping("/active")
    public ResponseEntity activePostBatchJob() throws IOException {
        batchService.readLine(FILE_PATH);
        return ResponseEntity.ok("Active Confirm");
    }

}