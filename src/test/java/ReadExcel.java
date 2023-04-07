import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ReadExcel {

    public ReadExcel() throws IOException, InvalidFormatException {
        String filepath="D:\\";
        File file=new File(filepath);
        FileInputStream stream=new FileInputStream(file);
        Workbook sheets= WorkbookFactory.create(stream);
        Sheet sheetAt = sheets.getSheetAt(0);
        Iterator<Row> iterator = sheetAt.iterator();

        ArrayList<Map<String,Integer>> list=new ArrayList<>();
        //表头名称和下标
        HashMap<String,Integer> nameIndex=new HashMap<>();
        while (iterator.hasNext()){
            Row next=iterator.next();
            Cell cell=next.createCell(0);
            cell.setCellType(CellType.STRING);

        }
    }
}
