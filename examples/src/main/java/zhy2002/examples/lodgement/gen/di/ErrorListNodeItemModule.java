package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@ErrorListNodeItemScope
public class ErrorListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @ErrorListNodeItemScope
    ErrorNode provideErrorNode(
        ErrorListNode parent,
        MembersInjector<ErrorNode> injector
    ) {
        ErrorNode node = new ErrorNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}