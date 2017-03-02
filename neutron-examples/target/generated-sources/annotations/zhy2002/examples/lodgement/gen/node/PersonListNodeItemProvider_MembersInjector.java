package zhy2002.examples.lodgement.gen.node;

import dagger.MembersInjector;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class PersonListNodeItemProvider_MembersInjector
    implements MembersInjector<PersonListNodeItemProvider> {
  private final MembersInjector<PersonNode> personNodeInjectorMembersInjector;

  public PersonListNodeItemProvider_MembersInjector(
      MembersInjector<PersonNode> personNodeInjectorMembersInjector) {
    assert personNodeInjectorMembersInjector != null;
    this.personNodeInjectorMembersInjector = personNodeInjectorMembersInjector;
  }

  public static MembersInjector<PersonListNodeItemProvider> create(
      MembersInjector<PersonNode> personNodeInjectorMembersInjector) {
    return new PersonListNodeItemProvider_MembersInjector(personNodeInjectorMembersInjector);
  }

  @Override
  public void injectMembers(PersonListNodeItemProvider instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.personNodeInjector = personNodeInjectorMembersInjector;
  }

  public static void injectPersonNodeInjector(
      PersonListNodeItemProvider instance, MembersInjector<PersonNode> personNodeInjector) {
    instance.personNodeInjector = personNodeInjector;
  }
}
