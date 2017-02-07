package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@CompanyListNodeItemScope
public class CompanyListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @CompanyListNodeItemScope
    CompanyNode provideCompanyNode(
        CompanyListNode parent,
        MembersInjector<CompanyNode> injector
    ) {
        CompanyNode node = new CompanyNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}