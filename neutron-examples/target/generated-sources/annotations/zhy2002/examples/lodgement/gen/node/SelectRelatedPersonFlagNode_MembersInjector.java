package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.SelectRelatedPersonFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class SelectRelatedPersonFlagNode_MembersInjector
    implements MembersInjector<SelectRelatedPersonFlagNode> {
  private final Provider<SelectRelatedPersonFlagNodeComponent.Builder> builderProvider;

  public SelectRelatedPersonFlagNode_MembersInjector(
      Provider<SelectRelatedPersonFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<SelectRelatedPersonFlagNode> create(
      Provider<SelectRelatedPersonFlagNodeComponent.Builder> builderProvider) {
    return new SelectRelatedPersonFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(SelectRelatedPersonFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      SelectRelatedPersonFlagNode instance,
      Provider<SelectRelatedPersonFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
