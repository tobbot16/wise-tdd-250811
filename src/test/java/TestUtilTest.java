import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;

public class TestUtilTest {



    @Test
    @DisplayName("TestUtil.getScanner()")
    void t1() {

        Scanner sc = TestUtil.genScanner("""
                        등록
                        너 자신을 알라
                        소크라테스
                        """
        );

        String cmd = sc.nextLine(); //등록
        String saying = sc.nextLine(); // 너 자신을 알라
        String author = sc.nextLine(); // 소크라테스

        assertThat(cmd).isEqualTo("등록");
        assertThat(saying).isEqualTo("너 자신을 알라");
        assertThat(author).isEqualTo("소크라테스");

        final String out = AppTest.run("""
                등록
                현재를 사랑하라.
                작자미상
                """);

        assertThat(out)
                .contains("명언 :")
                .contains("작가 :")
                .contains("1번 명언이 등록되었습니다.");
    }


}
