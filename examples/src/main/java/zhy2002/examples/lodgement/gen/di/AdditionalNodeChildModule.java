package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@AdditionalNodeChildScope
public class AdditionalNodeChildModule {

    private final AdditionalNode parent;

    public AdditionalNodeChildModule(AdditionalNode parent) {
        this.parent = parent;
    }


}