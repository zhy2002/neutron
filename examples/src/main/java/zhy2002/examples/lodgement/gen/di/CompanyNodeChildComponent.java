package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@CompanyNodeChildScope
@Subcomponent(modules = {CompanyNodeChildModule.class})
public interface CompanyNodeChildComponent {


    @Subcomponent.Builder
    interface Builder {

        Builder setCompanyNodeChildModule(CompanyNodeChildModule module);

        CompanyNodeChildComponent build();
    }
}
