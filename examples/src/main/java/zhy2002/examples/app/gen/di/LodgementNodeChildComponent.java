package zhy2002.examples.app.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.app.gen.*;

@LodgementNodeChildScope
@Subcomponent(modules = {LodgementNodeChildModule.class})
public interface LodgementNodeChildComponent {

    AppManagerNode provideAppManagerNode(@Named("appManagerNode") AppManagerNode impl);

}
