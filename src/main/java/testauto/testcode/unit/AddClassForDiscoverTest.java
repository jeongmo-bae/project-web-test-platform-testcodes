package testauto.testcode.unit;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

public class AddClassForDiscoverTest {
    @Test
    @DisplayName("테스트 클래스 신규시 Compile & Discover Node 정상동작 테스트")
    public void discoverTest(){
        Assertions.assertThat(1).isEqualTo(1);
    }

    @Nested
    @DisplayName("Test Class - Nested Class - Method 소스코드 파싱후 맵핑 문제 테스트")
    public class EBMNotManagementActivityRecomendedTimeTest {
        @Test
        @DisplayName("test1")
        void test1() throws InterruptedException {
            System.out.println("test1------");
            Thread.sleep(5000);
            Assertions.assertThat(1).isEqualTo(1);
        }
        @Test
        @DisplayName("test2")
        void test2() {
            Assertions.assertThat(100).isEqualTo(100);
        }
        @Test
        @DisplayName("test3")
        void test3() {
            Assertions.assertThat(1100).isEqualTo(100);
        }

        @Test
        @DisplayName("test4")
        void test4() {
            Assertions.assertThat(1100).isEqualTo(4100);
        }
        @Test
        @DisplayName("test5")
        void test5() {
            Assertions.assertThat(1100).isEqualTo(5100);
        }

        @AfterAll
        @DisplayName("Test Data Rollback")
        public static void afterAll() {
            System.out.println("AftertAll - Test Data Rollback");
        }
    }


}
