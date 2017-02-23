package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@OwnershipNodeScope
@Subcomponent(modules = {OwnershipNodeModule.class})
public interface OwnershipNodeComponent {

    OwnershipNodeRuleProvider getOwnershipNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setOwnershipNodeModule(OwnershipNodeModule module);

        OwnershipNodeComponent build();
    }
}
