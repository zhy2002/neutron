package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;
import zhy2002.examples.lodgement.gen.rule.*;

@CountryNodeScope
@Subcomponent(modules = {CountryNodeModule.class})
public interface CountryNodeComponent {

    CountryNodeRuleProvider getCountryNodeRuleProvider();

    @Subcomponent.Builder
    interface Builder {

        Builder setCountryNodeModule(CountryNodeModule module);

        CountryNodeComponent build();
    }
}
