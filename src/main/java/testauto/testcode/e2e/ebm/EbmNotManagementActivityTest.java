package testauto.testcode.e2e.ebm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.*;

public class EbmNotManagementActivityTest {
    @BeforeAll
    @DisplayName("insert test data & submit job schedule")
    public static void beforeAll() {
        System.out.println("insert test data");
        System.out.println("submit job schedule");
    }

    @Nested
    @DisplayName("Thread.Sleep걸고 Stdout 테스트")
    public class EBMNotManagementActivityRecomendedTimeTest {
        @Test
        @DisplayName("수행 222")
        void test1() throws InterruptedException {
            System.out.println("성공 시에도 로그 출력");
            Thread.sleep(10000);
            Assertions.assertThat(1).isEqualTo(1);
        }
        @Test
        @DisplayName("수행 3333스트")
        void test2() {
            Assertions.assertThat(1).isEqualTo(2);
        }
        @Test
        @DisplayName("수행 활동 정상 33334 테스트")
        void test3() {
            Assertions.assertThat(1).isEqualTo(3);
        }

        @Test
        @DisplayName("여러줄테스트 들어갑니다~ \n" +
                "ㅁㄴㅇㅁㄴㅇ\n" +
                "ㅁㄴㅇㅁㄴㅇ\n" +
                "ㅁㄴㅇㅁㄴㅇ\n" +
                "ㅁㄴㅇㅁㄴㅇ\n" +
                "ㅁㄴㅇㅁㄴㅇ")
        /*
        여러줄 테스트 안되니 주석 테스트 ㄱㄱㄱㄱㄱ
        ㅁㄴㅇㅁㅇㅁㄴㅇ
        ㅁㄴㅇㅁㄴㅇㄴㅁㅇ
         */
        void test4() {
            Assertions.assertThat(1).isEqualTo(4);
        }
        @Test
        @DisplayName("수행 활동 정상 종료 및 수행캠페인 정상 종료 테스트")
        void test5() {
            Assertions.assertThat(1).isEqualTo(5);
        }

        @AfterAll
        @DisplayName("Test Data Rollback")
        public static void afterAll() {
            System.out.println("AftertAll - Test Data Rollback");
        }
    }

    @Nested
    @DisplayName("관리활동이 아닌, 본부 EBM 선호시간 미활용 캠페인 테스트")
    public class EBMNotManagementActivityUserDefinedTimeTest {
        @Test
        @DisplayName("수행 고객군 정상 생성 테스트")
        void test1() {
            Assertions.assertThat(1).isEqualTo(1);
        }
        @Test
        @DisplayName("수행 고객군 제외로직 정상 테스트")
        void test2() {
            Assertions.assertThat(1).isEqualTo(2);
        }
        @Test
        @DisplayName("수행 활동 정상 생성 테스트")
        void test3() {
            Assertions.assertThat(1).isEqualTo(3);
        }

        @Test
        @DisplayName("수행 활동 고객군 정상 생성 테스트")
        void test4() {
            Assertions.assertThat(1).isEqualTo(4);
        }
        @Test
        @DisplayName("수행 활동 정상 종료 및 수행캠페인 정상 종료 테스트")
        void test5() {
            Assertions.assertThat(1).isEqualTo(5);
        }

        @AfterAll
        @DisplayName("Test Data Rollback")
        public static void afterAll() {
            System.out.println("AftertAll - Test Data Rollback");
        }
    }
}
