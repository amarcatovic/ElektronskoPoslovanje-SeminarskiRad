using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Text;

namespace Core.Models.Domain
{
    public class CreditCard
    {
        [Key]
        public int CreditCardId { get; set; }

        [Required]
        public string CreditCardNumber { get; set; }

        [Required]
        public string CardHolderName { get; set; }

        [Required]
        public DateTime ExpiryDate { get; set; }
    }
}
