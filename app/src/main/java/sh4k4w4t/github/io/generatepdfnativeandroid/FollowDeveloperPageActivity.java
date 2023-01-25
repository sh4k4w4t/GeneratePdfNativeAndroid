package sh4k4w4t.github.io.generatepdfnativeandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.pdf.PdfDocument;
import android.os.Bundle;
import android.view.View;

public class FollowDeveloperPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_follow_developer_page);

//        // create a new document
//        PdfDocument document = new PdfDocument();
//
//        // create a page description
//        PdfDocument.PageInfo pageInfo = new PdfDocument.PageInfo.Builder(100, 100, 1).create();
//
//        // start a page
//        PdfDocument.Page page = document.startPage(pageInfo);
//
//        // draw something on the page
//        View content = getContentView();
//        content.draw(page.getCanvas());
//
//        // finish the page
//        document.finishPage(page);
//
//        // add more pages
//
//        // write the document content
//        document.writeTo(getOutputStream());
//
//        // close the document
//        document.close();
    }
}