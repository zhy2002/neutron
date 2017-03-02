package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.LegalActionNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class LegalActionNode_MembersInjector implements MembersInjector<LegalActionNode> {
  private final Provider<LegalActionNodeComponent.Builder> builderProvider;

  public LegalActionNode_MembersInjector(
      Provider<LegalActionNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<LegalActionNode> create(
      Provider<LegalActionNodeComponent.Builder> builderProvider) {
    return new LegalActionNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(LegalActionNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      LegalActionNode instance, Provider<LegalActionNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
