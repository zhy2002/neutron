package zhy2002.examples.app.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.app.gen.*;

@Module(subcomponents = {
})
@AppManagerNodeChildScope
public class AppManagerNodeChildModule {

    private final AppManagerNode parent;

    public AppManagerNodeChildModule(AppManagerNode parent) {
        this.parent = parent;
    }


}