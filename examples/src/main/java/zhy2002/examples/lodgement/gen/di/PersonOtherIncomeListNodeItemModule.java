package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
    PersonOtherIncomeNodeChildComponent.class
})
@PersonOtherIncomeListNodeItemScope
public class PersonOtherIncomeListNodeItemModule {

    private final PersonOtherIncomeListNode parent;

    public PersonOtherIncomeListNodeItemModule(PersonOtherIncomeListNode parent) {
        this.parent = parent;
    }

    String getItemName() {
        return String.valueOf(parent.getChildSequenceNumber());
    }

    @Provides
    @PersonOtherIncomeListNodeItemScope
    PersonOtherIncomeNode providePersonOtherIncomeNode(
        MembersInjector<PersonOtherIncomeNode> injector
    ) {
        PersonOtherIncomeNode node = new PersonOtherIncomeNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}