import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MdParseTest {
    @Test
    public void testLabAgain() throws IOException {
        String contents = Files.readString(Path.of("./test-file.md"));
        List<String> expect = List.of("br()om.org", "haha.com");
        assertEquals(expect, MdParse.getLinks(contents));
    }
}
