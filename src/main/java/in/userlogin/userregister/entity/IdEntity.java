package in.userlogin.userregister.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "user_id")
public class IdEntity {
	    @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long user_id;
		public IdEntity() {
			super();
		}

		public IdEntity(Long user_id) {
			super();
			this.user_id = user_id;
		}

		public Long getUser_id() {
			return user_id;
		}

		public void setUser_id(Long user_id) {
			this.user_id = user_id;
		}
		
		
}
