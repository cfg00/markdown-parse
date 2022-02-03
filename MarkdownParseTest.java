import static org.junit.Assert.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.io.IOException;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }
    @Test //test-file.md
    public void testfilemd() throws IOException{
        Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        //first parameter is expected, second is actual value
        assertEquals(List.of("https://something.com","some-page.html"),MarkdownParse.getLinks(contents));
        
    }
    @Test //test.md
    public void test2md() throws IOException{
        Path fileName=Path.of("test2.md");
        String contents= Files.readString(fileName);

        assertEquals(List.of("link1.html"),MarkdownParse.getLinks(contents));

    }
    @Test //test3.md

    public void test3md() throws IOException{
        Path fileName=Path.of("test3.md");
        String contents= Files.readString(fileName);

        assertEquals(List.of(),MarkdownParse.getLinks(contents));

    }

    @Test //test-file2.md change this to actual thing, add testfile 2
    public void testfile2md() throws IOException{
        Path fileName=Path.of("test-file3.md");
        String contents= Files.readString(fileName);

        assertEquals(List.of(),MarkdownParse.getLinks(contents));

    }
    @Test //test file before
    public void testfile3md() throws IOException{
        Path fileName=Path.of("test3.md");
        String contents= Files.readString(fileName);

        assertEquals(List.of(),MarkdownParse.getLinks(contents));

}
}