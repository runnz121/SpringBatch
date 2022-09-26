package MiniProject1.service;

import com.opencsv.CSVReader;
import domain.PostData;
import java.io.FileReader;
import java.io.IOException;
import javax.sound.sampled.Line;
import org.springframework.stereotype.Service;

@Service
public class BatchService {

    public Line readLine(String filePath) throws IOException {

        CSVReader readCSV = new CSVReader(new FileReader(filePath));

        String [] inputData;

        while((inputData = readCSV.readNext())!= null) {

            inputData = readCSV.readNext();

            int i = 0;

            PostData savePostData = PostData
                .builder()
                .rowNumber(Long.valueOf(inputData[i]))
                .openServiceId(inputData[i++])
                .code(inputData[i++])
                .controlNum(inputData[i++])
                .allowNumber(inputData[i++])
                .shopName(inputData[i++])
                .streetAddress(inputData[i++])
                .locationAddress(inputData[i++])
                .operationCode(inputData[i++])
                .closedDate(inputData[i++])
                .regDate(inputData[i++])
                .openDate(inputData[i++])
                .designateDate(inputData[i++])
                .cancelRegDate(inputData[i++])
                .cancelReason(inputData[i++])
                .unAvailableDate(inputData[i++])
                .unAvailableReason(inputData[i++])
                .foodSort(inputData[i++])
                .reDesignateDate(inputData[i++])
                .lastModifiedDate(inputData[i++])
                .renewedDate(inputData[i++])
                .renewedSort(inputData[i++])
                .phoneNumber(inputData[i++])
                .build();
        }

        return null;
    }

}
