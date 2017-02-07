package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@CompanyListNodeItemScope
@Subcomponent(modules = {CompanyListNodeItemModule.class})
public interface CompanyListNodeItemComponent {

    CompanyNode provideCompanyNode();

}
