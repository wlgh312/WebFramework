package anno1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
@Retention(RetentionPolicy.RUNTIME)
public @interface TestInfo {
	int cnt() default 1;
	String str();
	String[] tStr() default "Kim";
}
