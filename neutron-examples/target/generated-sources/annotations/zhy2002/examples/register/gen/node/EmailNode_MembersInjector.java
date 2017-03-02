package zhy2002.examples.register.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;
import zhy2002.examples.register.gen.di.EmailNodeComponent;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EmailNode_MembersInjector implements MembersInjector<EmailNode> {
  private final Provider<EmailNodeComponent.Builder> builderProvider;

  public EmailNode_MembersInjector(Provider<EmailNodeComponent.Builder> builderProvider) {
    assert builderProvider != null;
    this.builderProvider = builderProvider;
  }

  public static MembersInjector<EmailNode> create(
      Provider<EmailNodeComponent.Builder> builderProvider) {
    return new EmailNode_MembersInjector(builderProvider);
  }

  @Override
  public void injectMembers(EmailNode instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.createComponent(builderProvider.get());
  }

  public static void injectCreateComponent(
      EmailNode instance, Provider<EmailNodeComponent.Builder> builderProvider) {
    instance.createComponent(builderProvider.get());
  }
}
