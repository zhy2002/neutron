package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.FirstHomeBuyerFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class FirstHomeBuyerFlagNode_MembersInjector
    implements MembersInjector<FirstHomeBuyerFlagNode> {
  private final Provider<FirstHomeBuyerFlagNodeComponent.Builder> builderProvider;

  public FirstHomeBuyerFlagNode_MembersInjector(
      Provider<FirstHomeBuyerFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<FirstHomeBuyerFlagNode> create(
      Provider<FirstHomeBuyerFlagNodeComponent.Builder> builderProvider) {
    return new FirstHomeBuyerFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(FirstHomeBuyerFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      FirstHomeBuyerFlagNode instance,
      Provider<FirstHomeBuyerFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
