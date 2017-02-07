package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@SubmissionNodeChildScope
public class SubmissionNodeChildModule {

    private final SubmissionNode parent;

    public SubmissionNodeChildModule(SubmissionNode parent) {
        this.parent = parent;
    }


}