package qualifier.type;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by geniusmart on 2016/5/30.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Two {
}
