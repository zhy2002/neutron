package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    PersonNodeChildComponent.class
})
@PersonListNodeItemScope
public class PersonListNodeItemModule {

    private final PersonListNode parent;

    public PersonListNodeItemModule(PersonListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @PersonListNodeItemScope
    PersonNode providePersonNode(
        MembersInjector<PersonNode> injector
    ) {
        PersonNode node = new PersonNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}