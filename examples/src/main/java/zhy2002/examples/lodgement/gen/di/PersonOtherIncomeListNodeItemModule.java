package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@PersonOtherIncomeListNodeItemScope
public class PersonOtherIncomeListNodeItemModule {

    String getItemName() {
        return "";
    }

    @Provides
    @PersonOtherIncomeListNodeItemScope
    PersonOtherIncomeNode providePersonOtherIncomeNode(
        PersonOtherIncomeListNode parent,
        MembersInjector<PersonOtherIncomeNode> injector
    ) {
        PersonOtherIncomeNode node = new PersonOtherIncomeNode(parent, getItemName());

        injector.injectMembers(node);
        return node;
    }

}