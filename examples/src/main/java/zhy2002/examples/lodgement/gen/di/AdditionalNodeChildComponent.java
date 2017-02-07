package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@AdditionalNodeChildScope
@Subcomponent(modules = {AdditionalNodeChildModule.class})
public interface AdditionalNodeChildComponent {


}
