package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@RentedFlagNodeScope
@Subcomponent(modules = {RentedFlagNodeModule.class})
public interface RentedFlagNodeComponent {

    RentedFlagNodeRuleProvider getRentedFlagNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setRentedFlagNodeModule(RentedFlagNodeModule module);

        RentedFlagNodeComponent build();
    }
}
