package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@PreviousEmploymentListNodeItemScope
@Subcomponent(modules = {PreviousEmploymentListNodeItemModule.class})
public interface PreviousEmploymentListNodeItemComponent {

    PreviousEmploymentNode providePreviousEmploymentNode();

    @Subcomponent.Builder
    interface Builder {

        Builder setPreviousEmploymentListNodeItemModule(PreviousEmploymentListNodeItemModule module);

        PreviousEmploymentListNodeItemComponent build();
    }
}
