package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import dagger.internal.Factory;
import dagger.internal.MembersInjectors;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonListNodeItemProvider_Factory
    implements Factory<SelectRelatedPersonListNodeItemProvider> {
  private final MembersInjector<SelectRelatedPersonListNodeItemProvider>
      selectRelatedPersonListNodeItemProviderMembersInjector;

  public SelectRelatedPersonListNodeItemProvider_Factory(
      MembersInjector<SelectRelatedPersonListNodeItemProvider>
          selectRelatedPersonListNodeItemProviderMembersInjector) {
    assert selectRelatedPersonListNodeItemProviderMembersInjector != null;
    this.selectRelatedPersonListNodeItemProviderMembersInjector =
        selectRelatedPersonListNodeItemProviderMembersInjector;
  }

  @Override
  public SelectRelatedPersonListNodeItemProvider get() {
    return MembersInjectors.injectMembers(
        selectRelatedPersonListNodeItemProviderMembersInjector,
        new SelectRelatedPersonListNodeItemProvider());
  }

  public static Factory<SelectRelatedPersonListNodeItemProvider> create(
      MembersInjector<SelectRelatedPersonListNodeItemProvider>
          selectRelatedPersonListNodeItemProviderMembersInjector) {
    return new SelectRelatedPersonListNodeItemProvider_Factory(
        selectRelatedPersonListNodeItemProviderMembersInjector);
  }
}
