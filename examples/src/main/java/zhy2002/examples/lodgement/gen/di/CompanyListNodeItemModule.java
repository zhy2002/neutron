package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    CompanyNodeChildComponent.class
})
@CompanyListNodeItemScope
public class CompanyListNodeItemModule {

    private final CompanyListNode parent;

    public CompanyListNodeItemModule(CompanyListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @CompanyListNodeItemScope
    CompanyNode provideCompanyNode(
        MembersInjector<CompanyNode> injector
    ) {
        CompanyNode node = new CompanyNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}