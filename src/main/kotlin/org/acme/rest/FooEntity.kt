package org.acme.rest

import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepositoryBase
import java.util.*
import javax.enterprise.context.ApplicationScoped
import javax.persistence.Entity
import javax.persistence.Id

@Entity
class FooEntity(@Id var uuid: UUID = UUID.randomUUID()) {
}

@ApplicationScoped
class FooEntityRepo : PanacheRepositoryBase<FooEntity, UUID>
