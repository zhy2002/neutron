package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonNodeChildProvider_Factory
    implements Factory<SelectRelatedPersonNodeChildProvider> {
  private final MembersInjector<SelectRelatedPersonNodeChildProvider>
      selectRelatedPersonNodeChildProviderMembersInjector;

  public SelectRelatedPersonNodeChildProvider_Factory(
      MembersInjector<SelectRelatedPersonNodeChildProvider>
          selectRelatedPersonNodeChildProviderMembersInjector) {
    assert selectRelatedPersonNodeChildProviderMembersInjector != null;
    this.selectRelatedPersonNodeChildProviderMembersInjector =
        selectRelatedPersonNodeChildProviderMembersInjector;
  }

  @Override
  public SelectRelatedPersonNodeChildProvider get() {
    return MembersInjectors.injectMembers(
        selectRelatedPersonNodeChildProviderMembersInjector,
        new SelectRelatedPersonNodeChildProvider());
  }

  public static Factory<SelectRelatedPersonNodeChildProvider> create(
      MembersInjector<SelectRelatedPersonNodeChildProvider>
          selectRelatedPersonNodeChildProviderMembersInjector) {
    return new SelectRelatedPersonNodeChildProvider_Factory(
        selectRelatedPersonNodeChildProviderMembersInjector);
  }
}
