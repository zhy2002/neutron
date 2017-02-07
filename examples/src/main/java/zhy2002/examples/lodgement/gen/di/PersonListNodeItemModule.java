package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonListNodeItemScope
public class PersonListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @PersonListNodeItemScope
    PersonNode providePersonNode(
        PersonListNode parent,
        MembersInjector<PersonNode> injector
    ) {
        PersonNode node = new PersonNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}