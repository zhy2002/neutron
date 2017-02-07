package zhy2002.examples.lodgement.gen.di;
import dagger.*;
import javax.inject.Named;
import zhy2002.examples.lodgement.gen.*;

@Module(subcomponents = {
})
@CompanyNodeChildScope
public class CompanyNodeChildModule {

    private final CompanyNode parent;

    public CompanyNodeChildModule(CompanyNode parent) {
        this.parent = parent;
    }


}