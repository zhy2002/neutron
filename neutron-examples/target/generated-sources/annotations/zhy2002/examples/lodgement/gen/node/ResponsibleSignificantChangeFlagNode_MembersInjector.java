package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.lodgement.gen.di.ResponsibleSignificantChangeFlagNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class ResponsibleSignificantChangeFlagNode_MembersInjector
    implements MembersInjector<ResponsibleSignificantChangeFlagNode> {
  private final Provider<ResponsibleSignificantChangeFlagNodeComponent.Builder> builderProvider;

  public ResponsibleSignificantChangeFlagNode_MembersInjector(
      Provider<ResponsibleSignificantChangeFlagNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<ResponsibleSignificantChangeFlagNode> create(
      Provider<ResponsibleSignificantChangeFlagNodeComponent.Builder> builderProvider) {
    return new ResponsibleSignificantChangeFlagNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(ResponsibleSignificantChangeFlagNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      ResponsibleSignificantChangeFlagNode instance,
      Provider<ResponsibleSignificantChangeFlagNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
