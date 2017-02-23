package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OtherAssetNodeScope
@Subcomponent(modules = {OtherAssetNodeModule.class})
public interface OtherAssetNodeComponent {

    OtherAssetNodeRuleProvider getOtherAssetNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOtherAssetNodeModule(OtherAssetNodeModule module);

        OtherAssetNodeComponent build();
    }
}
