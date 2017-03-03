package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@AssetsNodeScope
@Subcomponent(modules = {AssetsNodeModule.class})
public interface AssetsNodeComponent {

    AssetsNodeRuleProvider getAssetsNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setAssetsNodeModule(AssetsNodeModule module);

        AssetsNodeComponent build();
    }
}
