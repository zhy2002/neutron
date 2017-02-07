package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PersonOtherIncomeListNodeItemScope
@Subcomponent(modules = {PersonOtherIncomeListNodeItemModule.class})
public interface PersonOtherIncomeListNodeItemComponent {

    PersonOtherIncomeNode providePersonOtherIncomeNode();

}
