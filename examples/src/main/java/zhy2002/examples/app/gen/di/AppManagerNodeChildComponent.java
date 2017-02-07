package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.app.gen.*;

@AppManagerNodeChildScope
@Subcomponent(modules = {AppManagerNodeChildModule.class})
public interface AppManagerNodeChildComponent {


}
