package builder;

public class Direct {
    private Builder builder;

    public Direct(Builder builder) {
        this.builder = builder;
    }

    /* 문서를 만드는 클래스 */
    public void construct() {
        builder.makeTitle("제목아 안녕");
        builder.makeString("내용아 안녕");
        builder.makeItems(new String[]{
                "잘 지내니?",
                "안녕?",
                "밥은 먹었니"
        });

        builder.makeString("야구팀");
        builder.makeItems(new String[]{
                "두산",
                "삼성",
                "기아"
        });
    }
}
