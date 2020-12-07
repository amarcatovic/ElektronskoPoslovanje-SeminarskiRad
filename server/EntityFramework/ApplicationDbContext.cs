using Core.Models.Domain;
using Microsoft.EntityFrameworkCore;

namespace EntityFramework
{
    public class ApplicationDbContext : DbContext
    {
        public DbSet<CreditCard> CreditCards { get; set; }

        public ApplicationDbContext(DbContextOptions<ApplicationDbContext> options) : base(options) {}

        protected override void OnModelCreating(ModelBuilder modelBuilder)
        {
            base.OnModelCreating(modelBuilder);
        }
    }
}
