
package webec

/*

import grails.gorm.transactions.Transactional

@Transactional
class PlayerService {

    def serviceMethod() {

    }
}
*/


import grails.gorm.services.Service

@Service(Player)
interface PlayerService {

    Player get(Serializable id)

    List<Player> list(Map args)

    Long count()

    void delete(Serializable id)

    Player save(Player player)

}
