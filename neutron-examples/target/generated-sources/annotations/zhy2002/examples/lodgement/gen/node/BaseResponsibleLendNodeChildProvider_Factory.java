package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class BaseResponsibleLendNodeChildProvider_Factory
    implements Factory<BaseResponsibleLendNodeChildProvider> {
  private final MembersInjector<BaseResponsibleLendNodeChildProvider>
      baseResponsibleLendNodeChildProviderMembersInjector;

  public BaseResponsibleLendNodeChildProvider_Factory(
      MembersInjector<BaseResponsibleLendNodeChildProvider>
          baseResponsibleLendNodeChildProviderMembersInjector) {
    assert baseResponsibleLendNodeChildProviderMembersInjector != null;
    this.baseResponsibleLendNodeChildProviderMembersInjector =
        baseResponsibleLendNodeChildProviderMembersInjector;
  }

  @Override
  public BaseResponsibleLendNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        baseResponsibleLendNodeChildProviderMembersInjector,
        new BaseResponsibleLendNodeChildProvider());
  }

  public static Factory<BaseResponsibleLendNodeChildProvider> create(
      MembersInjector<BaseResponsibleLendNodeChildProvider>
          baseResponsibleLendNodeChildProviderMembersInjector) {
    return new BaseResponsibleLendNodeChildProvider_Factory(
        baseResponsibleLendNodeChildProviderMembersInjector);
  }
}
