import com.github.javafaker.Faker;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;


public class RandomDataFile {

    public static void main(String[] args) throws IOException {

        String filePath = "randomData.txt";

        Faker faker = new Faker();

        File data = new File(filePath);
        if(!data.exists()){
            data.createNewFile();
        }

        PrintWriter addData = new PrintWriter(filePath);
        for(int i=0;i<10; i++){

            addData.print(faker.name().firstName() + ", ");
            addData.print(faker.name().lastName() + ", ");
            addData.print(faker.address().city() + ", ");
            addData.println(faker.number().randomNumber());
        }

        addData.close();

    }
}
