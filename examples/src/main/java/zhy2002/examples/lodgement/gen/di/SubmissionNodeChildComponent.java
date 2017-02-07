package zhy2002.examples.lodgement.gen.di;
import dagger.Subcomponent;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@SubmissionNodeChildScope
@Subcomponent(modules = {SubmissionNodeChildModule.class})
public interface SubmissionNodeChildComponent {


    @Subcomponent.Builder
    interface Builder {

        Builder setSubmissionNodeChildModule(SubmissionNodeChildModule module);

        SubmissionNodeChildComponent build();
    }
}
