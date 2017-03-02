package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.AccessTelephoneNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AccessTelephoneNode_MembersInjector
    implements MembersInjector<AccessTelephoneNode> {
  private final Provider<AccessTelephoneNodeComponent.Builder> builderProvider;

  public AccessTelephoneNode_MembersInjector(
      Provider<AccessTelephoneNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<AccessTelephoneNode> create(
      Provider<AccessTelephoneNodeComponent.Builder> builderProvider) {
    return new AccessTelephoneNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(AccessTelephoneNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      AccessTelephoneNode instance,
      Provider<AccessTelephoneNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
